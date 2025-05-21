/** @file main.c
 *  @brief 2つの整数の和を表示する
 *  @date 2021/3/2
 *  @author Toru Tamaki
 */

#include <stdio.h>

/** @fn int main(void)
 *  @brief  2つの整数の和を表示する
 * 
 *  入力：
 *  - 標準入力に2つの整数が与えられる
 * 
 *  出力：
 *  - 2個の整数の和を表示する
 * 
 *  @date   2021/3/2
 *  @author Toru Tamaki
 */
int main(void){
    int a, b;
    scanf("%d%d", &a, &b);
    printf("%d\n", a + b);
    return 0;
}