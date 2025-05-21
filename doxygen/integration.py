## @class AddOrMult
#  @brief myaddもしくはmymultを計算する
class AddOrMult():

    def __init__(self, add_func, mult_func):
        super().__init__()
        self.add = add_func
        self.mult = mult_func

    ## @fn do(self, a, b, c)
    #  @brief aとbの和もしくは積を計算する
    #  @param   a (int): 1つ目の引数
    #  @param   b (int): 2つ目の引数
    #  @param   c (str): "add"もしくは"mult"．"add"が指定されたらa+bを，"mult"が指定されたら"a*b"を返す
    #  @return   int: a+bまたはa*b
    def do(self, a, b, c):
        if c == 'add':
            return self.add(a, b)
        if c == 'mult':
            return self.mult(a, b)
        return None
