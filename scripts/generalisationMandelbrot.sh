#!/bin/sh

if [ ! -d "../generalisationMandelbrot" ];then
  mkdir ../generalisationMandelbrot
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

java -jar ../build/libs/sae-2022-2023.jar -w 100 -h 100 -s 1 -x $x -y $y -f generalisationMandelbrot -p $p -n 100 -o generalisationMandelbrot.pnj
