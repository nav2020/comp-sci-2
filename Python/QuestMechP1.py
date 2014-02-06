def prob1(x, v1, v2):
    t = x/v1
    x2 = v2*t
    return x - x2
def prob2(t1, v, x, t2):
	dx = v * (t2-t1)
	return x + dx
def prob3(v, t):
	v = v * 0.2778
	return v * t

# PROBLEM 1
# args: Length of the table (cm), velocity of the first ant (cm/s) and v of send ant (cm/s)
print "1. " + str(prob1(52,4.92,2)) + " cm"
# PROBLEM 2
# args: Start time (h, decimal), car velocity (km/h), distance from school (km), end time (h, decimal)
print "2. " + str(prob2(1,95,26,3.5)) + " km"
# PROBLEM 3
# args: velocity (in k/h), time (in s)
print "3. " + str(prob3(62, .705)) + " m"
raw_input()