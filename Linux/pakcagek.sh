#echo "Hi"

pip install $1

var="$(which $1)"


#echo $var
if [ -z "$var" ]
then
	echo false;
else
	echo true;

fi
