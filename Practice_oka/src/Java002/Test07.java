/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test07 <br />
 * 1~100の数値をループで回して、加算する <br />
 * 更新履歴 2015/12/05 岡智美：新規作成 <br />
 * 更新履歴 2015/12/06 岡智美：addメソッド追加 <br />
 */

public class Test07 {
  
  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test07() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド <br />
   * 処理を起動します。 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int i; // ループ用項目
    int sum = 0; // 加算累積用項目
    for ( i = 0; i <= 100; i++ ) { // iの初期値＝1　i≦100の間、iを1ずつ加算しながら{}内処理を実行する。
      sum = sum + i;
    }
    System.out.println( sum ); // 処理結果表示。
  }

  /**
   * addメソッド <br />
   * a~bの数字を全て加算し、結果を戻り値で返します。 <br />
   */
  public static int add( int a, int b ) {
    int sum = 0; // 加算累積用項目
    for ( a = 0; a <= b; a++ ) { // iの初期値＝1　i≦100の間、iを1ずつ加算しながら{}内処理を実行する。
      sum = sum + a;
    }
    return sum;
  }

}
