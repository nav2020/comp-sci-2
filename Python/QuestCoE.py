import math

def prob1(r, a):
	h = r - r*math.cos(math.radians(a))
	print math.sqrt(2.0*9.8*h)

prob1(2,32)