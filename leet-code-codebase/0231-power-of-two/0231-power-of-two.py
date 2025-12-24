class Solution(object):
    def isPowerOfTwo(self, n):
        if n == 1:
            return True
        else:
            while(n > 0):
                if n % 2 == 0:
                    if n == 2:
                        return True
                    n = n // 2
                else:
                    return False   
            return False 
        
        