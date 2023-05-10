import time

def timer():
    string=time.strftime("%H: %M: %S %P")
    print(string)
    
    time.sleep(1)
    timer()
timer()

def fetch():
    print('this is test for fetch')
    print('another test')
