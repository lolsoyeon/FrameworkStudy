SELECT USER
FROM DUAL;
--==>> SYS

--■■■오라클암호화복호화01_sys ■■■
/*
1. 오라클 암호화 기능을 사용하기 위해서는
   『DBMS_OBFUSCATION_TOOLKIT』 패키지를 이용한다.
    암호화, 복호화 알고리즘을 직접 구현하는 것도 가능하다.
    하지만, 편의상 오라클에서 지공해주는 패키지를 통해 구현할 수도 있다.

2.『DBMS_OBFUSCATION_TOOLKIT』패키지는
    기본적으로 사용할 수 없는 상태로 설정되어있다.(DRFAULT 설정 상)
    이 패키지를 사용하기 위해서는 추가 설치 과정이 필요하다.
    (dbmsobtk.spl, prvtobtk.plb 파일을 찾아서 실행할 수 있도록 한다.)
    
3. 이패키지는 4개의 프로시저로 이루어져 있다.
    VARCHER2 타입을 Encrypt/Decrypt 할 수 있는 2개의 프로시저
    RAW 타입을 Encrypt/Decrypt 할 수있는 2개의 프로시저
    (다른 타입은 지원하지 않기 때문에 NUMBER ㅌ타입인 경우 TO_CHER 사용)
    
    ※ RAW, LONG RAW, ROWID 타입
    그래픽 이미지나 디지털 사운드를 저장
    XEXA-DECEMAL(16진수) 형태로 RETURN
    RAW 는 VARCHER2와 유사
    LONG RAW 는 LONG 과 유사하나 다음과 같은 제한사항이 있다.
    ·저장과 추출만 가능하고, 데이터를 가공할 수 없다.
    ·LONG RAW 는 LONG 과 같은 제한 사항을 갖는다.
    
--○ 암호화 패키지 설치
dbmsbtk.spl, prvtobtk.plb 파일에 접근하는 경로


『C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\dbmsobtk.sql』
『C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\prvtobtk.plb』
    
*/

@C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\dbmsobtk.sql
@C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\prvtobtk.plb
/*
Library DBMS_OBFUSCATION_LIB이(가) 컴파일되었습니다.


Library CRYPTO_TOOLKIT_LIBRARY이(가) 컴파일되었습니다.


Package DBMS_CRYPTO이(가) 컴파일되었습니다.


SYNONYM DBMS_CRYPTO이(가) 생성되었습니다.


Package DBMS_OBFUSCATION_TOOLKIT이(가) 컴파일되었습니다.


SYNONYM DBMS_OBFUSCATION_TOOLKIT이(가) 생성되었습니다.


Grant을(를) 성공했습니다.


Package DBMS_SQLHASH이(가) 컴파일되었습니다.


SYNONYM DBMS_SQLHASH이(가) 생성되었습니다.


Package DBMS_CRYPTO_FFI이(가) 컴파일되었습니다.


Package Body DBMS_CRYPTO_FFI이(가) 컴파일되었습니다.


Package Body DBMS_CRYPTO이(가) 컴파일되었습니다.


Package DBMS_OBFUSCATION_TOOLKIT_FFI이(가) 컴파일되었습니다.


Package Body DBMS_OBFUSCATION_TOOLKIT_FFI이(가) 컴파일되었습니다.


Package Body DBMS_OBFUSCATION_TOOLKIT이(가) 컴파일되었습니다.


Package Body DBMS_SQLHASH이(가) 컴파일되었습니다.
*/


--○ SCOTT 계정에 이 패키지를 사용할 수 있는 권한 부여(SYS 가...)
GRANT EXECUTE ON DBMS_OBFUSCATION_TOOLKIT TO SCOTT;
--==>> Grant을(를) 성공했습니다.













