# Factoring Program
# Drew Higgins
# 1/13/2014
from math import sqrt
a = input("Enter the coefficient of x^2: ")
b = input("Enter the coefficient of x: ")
c = input("Enter the coefficient of the constant: ")
det = (b**2) - (4 * a * c)
if det < 0:
	print "Not a real number"
else:
	x1 = str(-1*(-b + sqrt(det))/(2 * a))
	x2 = str(-1*(-b - sqrt(det))/(2 * a))
	print str(a) + "(x + " + x1 + ")(x + " + x2 + ")"