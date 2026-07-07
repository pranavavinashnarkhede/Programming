def ChkPrime(value):

    flag = True
    for i in range(2 , value):
        if (value % i == 0):
            flag = False
            break
        
    return flag
               

    
def ListPrime(data):
    sum = 0 

    for no in data:
        Ret = ChkPrime(no)

        if Ret == True:
            sum = sum + no

    return sum
