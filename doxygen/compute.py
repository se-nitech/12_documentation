## @fn myadd(a, b)
#  @brief aとbの和を計算する
#  @param   a (int): 1つ目の引数
#  @param   b (int): 2つ目の引数
#  @return   int: aとbの和
def myadd(a, b):

    if a > 0 and b > 0:
        return a + b

    if a < 0 and b < 0:
        return a + b

    if a == 0:
        return b

    if b == 0:
        return a

    if a > 0 and b < 0:
        if abs(a) > abs(b):
            return a + b
        if abs(a) < abs(b):
            return a + b

    return 0

## @fn mymult(a, b)
#  @brief aとbの積を計算する
#  @param   a (int): 1つ目の引数
#  @param   b (int): 2つ目の引数
#  @return   int: aとbの積
def mymult(a, b):

    if a > 0 and b > 0:
        return a * b

    if a < 0 and b < 0:
        return a * b

    if a > 0 and b < 0:
        return a * b

    if a < 0 and b > 0:
        return a * b

    if a == 0:
        return 0

    if b == 0:
        return 0

    return -100
