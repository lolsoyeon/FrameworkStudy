SELECT USER
FROM DUAL;
--==>> SYS

--�������Ŭ��ȣȭ��ȣȭ01_sys ����
/*
1. ����Ŭ ��ȣȭ ����� ����ϱ� ���ؼ���
   ��DBMS_OBFUSCATION_TOOLKIT�� ��Ű���� �̿��Ѵ�.
    ��ȣȭ, ��ȣȭ �˰����� ���� �����ϴ� �͵� �����ϴ�.
    ������, ���ǻ� ����Ŭ���� �������ִ� ��Ű���� ���� ������ ���� �ִ�.

2.��DBMS_OBFUSCATION_TOOLKIT����Ű����
    �⺻������ ����� �� ���� ���·� �����Ǿ��ִ�.(DRFAULT ���� ��)
    �� ��Ű���� ����ϱ� ���ؼ��� �߰� ��ġ ������ �ʿ��ϴ�.
    (dbmsobtk.spl, prvtobtk.plb ������ ã�Ƽ� ������ �� �ֵ��� �Ѵ�.)
    
3. ����Ű���� 4���� ���ν����� �̷���� �ִ�.
    VARCHER2 Ÿ���� Encrypt/Decrypt �� �� �ִ� 2���� ���ν���
    RAW Ÿ���� Encrypt/Decrypt �� ���ִ� 2���� ���ν���
    (�ٸ� Ÿ���� �������� �ʱ� ������ NUMBER ��Ÿ���� ��� TO_CHER ���)
    
    �� RAW, LONG RAW, ROWID Ÿ��
    �׷��� �̹����� ������ ���带 ����
    XEXA-DECEMAL(16����) ���·� RETURN
    RAW �� VARCHER2�� ����
    LONG RAW �� LONG �� �����ϳ� ������ ���� ���ѻ����� �ִ�.
    ������� ���⸸ �����ϰ�, �����͸� ������ �� ����.
    ��LONG RAW �� LONG �� ���� ���� ������ ���´�.
    
--�� ��ȣȭ ��Ű�� ��ġ
dbmsbtk.spl, prvtobtk.plb ���Ͽ� �����ϴ� ���


��C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\dbmsobtk.sql��
��C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\prvtobtk.plb��
    
*/

@C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\dbmsobtk.sql
@C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\prvtobtk.plb
/*
Library DBMS_OBFUSCATION_LIB��(��) �����ϵǾ����ϴ�.


Library CRYPTO_TOOLKIT_LIBRARY��(��) �����ϵǾ����ϴ�.


Package DBMS_CRYPTO��(��) �����ϵǾ����ϴ�.


SYNONYM DBMS_CRYPTO��(��) �����Ǿ����ϴ�.


Package DBMS_OBFUSCATION_TOOLKIT��(��) �����ϵǾ����ϴ�.


SYNONYM DBMS_OBFUSCATION_TOOLKIT��(��) �����Ǿ����ϴ�.


Grant��(��) �����߽��ϴ�.


Package DBMS_SQLHASH��(��) �����ϵǾ����ϴ�.


SYNONYM DBMS_SQLHASH��(��) �����Ǿ����ϴ�.


Package DBMS_CRYPTO_FFI��(��) �����ϵǾ����ϴ�.


Package Body DBMS_CRYPTO_FFI��(��) �����ϵǾ����ϴ�.


Package Body DBMS_CRYPTO��(��) �����ϵǾ����ϴ�.


Package DBMS_OBFUSCATION_TOOLKIT_FFI��(��) �����ϵǾ����ϴ�.


Package Body DBMS_OBFUSCATION_TOOLKIT_FFI��(��) �����ϵǾ����ϴ�.


Package Body DBMS_OBFUSCATION_TOOLKIT��(��) �����ϵǾ����ϴ�.


Package Body DBMS_SQLHASH��(��) �����ϵǾ����ϴ�.
*/


--�� SCOTT ������ �� ��Ű���� ����� �� �ִ� ���� �ο�(SYS ��...)
GRANT EXECUTE ON DBMS_OBFUSCATION_TOOLKIT TO SCOTT;
--==>> Grant��(��) �����߽��ϴ�.













