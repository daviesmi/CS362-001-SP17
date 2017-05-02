#!/bin/bash
#Dir variable, than add to text
#First checks to make certain the number of arguments provided is correct
if [[ $# -ne 1 ]] && [[ $# -ne 2 ]]
then
    echo "./stats {-rows|-cols} [file]"
    exit 1
fi

#If there are a correct number of arguments, check to make sure rows or columns have been specified
if ! [[ $1 =~ ^-r.* ]] && ! [[ $1 =~ ^-c.* ]]
then
    echo "./stats: $1 is not a valid argument, please indicate rows or columns"
    exit 1
fi

#If rows or columns have been specified, check to make sure that if two arguments have been provided the file exists
if [[ $# -eq 2 ]] && ! [[ -f $2 ]]
then
    echo "./stats: cannot read $2"
    exit 1
fi

#If all arguments are adequate, runs mean and median calculations depending on the number of arguments
#2 arguments: input file is considered the second argument
#1 argument: input file is considered stdin
if [[ $# -eq 2 ]]
then
    ifile = $2
else
    ifile = /dev/stdin

if [[ $1 =~ ^-r.* ]]
then
    echo "Calculating row stats"
elif [[ $1 =~ ^-c.* ]]
then
    tfile = tempCol
    touch ./$tfile
    echo "Calculating column stats"
    #Counts the number of columns in the file
    columns=$(head -n 1 $ifile|wc -w)
    for((i=1; i<=$columns;i++)); do
        cut -c $i $ifile >> $tfile;
    done
fi