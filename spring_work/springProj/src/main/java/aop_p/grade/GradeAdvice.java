package aop_p.grade;


import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class GradeAdvice {
	
	
	
	
	public int aarg=0;
	public int barg=0;
	public int carg=0;
	void two(JoinPoint joinPoint, int[] t1, int[] e1) {
		
		int arg1=0;
		int arg2=0;
		int arg=0;
		int total=0;
		for(int i=0;i<t1.length;i++) {
			arg1=arg1+=(t1[i]/t1.length);
			arg2=arg2+=(e1[i]/t1.length);
		}
		total = arg1+arg2;
		arg= total/2;
		aarg=arg;
		System.out.println("학생수 : "+t1.length+", 국어 평균 : "+arg1+", 영어평균 : "+arg2+", 평균합계 : "+total+", 전체평균 : "+arg);
	}
	void three(JoinPoint joinPoint, int[] t2, int[] e2, int[] m2 ) {
		
		int arg1=0;
		int arg2=0;
		int arg3=0;
		int arg=0;
		int total=0;
		for(int i=0;i<t2.length;i++) {
			arg1=arg1+=(t2[i]);
			arg2=arg2+=(e2[i]);
			 arg3=arg3+=(m2[i]);
			 
		}
		arg3=arg3/t2.length;
		arg2=arg2/t2.length;
		arg1=arg1/t2.length;
		total = arg1+arg2+arg3;
		arg= total/3;
		System.out.println("학생수 : "+t2.length+", 국어 평균 : "+arg1+", 영어평균 : "+arg2+", 수학평균 : "+arg3+", 평균합계 : "+total+",전체평균 : "+arg);
		barg=arg;
	}
void four(JoinPoint joinPoint, int[] t1, int e1[], int[] m1, int[] h1 ) {
		
		int arg1=0;
		int arg2=0;
		int arg3=0;
		int arg4=0;
		int arg=0;
		int total=0;
		for(int i=0;i<t1.length;i++) {
			arg1=arg1+=(t1[i]);
			arg2=arg2+=(e1[i]);
			arg3=arg3+=(m1[i]);
			arg4=arg4+=(h1[i]);
		}
		arg3=arg3/t1.length;
		arg4=arg4/t1.length;
		arg2=arg2/t1.length;
		arg1=arg1/t1.length;
		total = arg1+arg2+arg3+arg4;
		arg= total/4;
		carg=arg;
		System.out.println("학생수 : "+t1.length+", 국어 평균 : "+arg1+", 영어평균 : "+arg2+", 수학평균 : "+arg3+", 체육평균 : "+arg4+" ,평균합계 : "+total+", 전체평균 : "+arg);
	}
	
	

	
	
	
}
