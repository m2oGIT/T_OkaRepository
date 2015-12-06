/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test09 <br />
 * 1~引数の数値をループで回して、加算する <br />
 * 更新履歴 2015/12/05 岡智美：新規作成 <br />
 */

public class Test09 {
  
  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test09() {
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
    int lmt = Integer.parseInt( args[0] );
    // 引数を数字型に変換し、上限値に設定

    for ( i = 0; i <= lmt; i++ ) { // iの初期値＝1　i≦引数の間、iを1ずつ加算しながら{}内処理を実行する。
      sum = sum + i;
    }
    System.out.println( sum ); // 処理結果表示。
  }

}
