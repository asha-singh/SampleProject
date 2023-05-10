import time

def timer():
    string=time.strftime("%H: %M: %S %P")
    print(string)
    
    time.sleep(1)
    timer()

timer()    

fetch() 
