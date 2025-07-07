'''
Created on 2025. 6. 20.

@author: user
'''

stu1 = {'stuNum' : 1000,
        'stuName' : 'Hong',
        'stuMajor' : 'Computer',
        'stuName' : 'Lee'}

print(len(stu1), stu1, type(stu1))

stu1['stuPhone'] = '010-1111-2222'

print(len(stu1), stu1, type(stu1))

stu1['nam'] = 'Lee'
print(stu1)

del(stu1['nam'])
print(stu1)

print(stu1.get('stuMajor'))

print(stu1.keys())

print(stu1.values())

print(stu1.items())

print('name' in stu1)
print('stuName' in stu1)