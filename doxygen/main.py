import argparse
from compute import myadd, mymult
from integration import AddOrMult


## @fn mycompute(a, b, c)
#  @brief aとbの和もしくは積を計算する
#  @param   a (int): 1つ目の引数
#  @param   b (int): 2つ目の引数
#  @param   c (str): "add"もしくは"mult"．"add"が指定されたらa+bを，"mult"が指定されたら"a*b"を返す
#  @return   int: a+bまたはa*b
def mycompute(a, b, c):
    if c == "add":
        return myadd(a, b)
    if c == "mul":
        return mymult(a, b)
    return


def main():
    parser = argparse.ArgumentParser(description='add or multiply two numbers')
    parser.add_argument('arg1', type=int,
                        help='first argment')
    parser.add_argument('arg2', type=int,
                        help='second argment')
    parser.add_argument('arg3', choices=['add', 'mult'],
                        help='add or mult (default: add)')
    args = parser.parse_args()
    a = args.arg1
    b = args.arg2
    c = args.arg3

    val = mycompute(a, b, c)
    print(val)

    add_or_mult_instance = AddOrMult(myadd, mymult)
    val = add_or_mult_instance.do(a, b, c)
    print(val)


if __name__ == '__main__':
    main()
