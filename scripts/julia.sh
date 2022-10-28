#!/bin/sh

if [ ! -d "../julia" ];then
  mkdir ../julia
fi

while getopts :x:y:p: param;
do
    case ${param} in
        x)
            x=${OPTARG}
            ;;
	      y)
            y=${OPTARG}
            ;;
	      p)
            p=${OPTARG}
            ;;
	      *)
            usage
            ;;
    esac
done

java -jar ../build/libs/sae-2022-2023.jar -w 100 -h 100 -s 1 -x $x -y $y -f Julia -p $p -n 100 -o julia.pnj

