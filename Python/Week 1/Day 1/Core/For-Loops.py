# print(0,50)
# for i in range(0,151):
#     print(i)
     
# print(5,1000,5)
# for i in range(5,1000,5):
#     print (i)

     
# for i in range(1, 101):
#     if i % 10 == 0:
#         print("Coding Dojo")
#     elif i % 5 == 0:
#         print("Coding")
#     else:
#         print(i)

sum_odd = 0
for i in range(1, 500001, 2):
    sum_odd += i
print("Sum of odd integers:", sum_odd)

for i in range(2018, 0, -4):
    print(i)
    
lowNum = 2
highNum = 9
mult = 3
for i in range(lowNum, highNum + 1):
    if i % mult == 0:
        print(i)
