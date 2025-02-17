class P4 {

public int test() {
try {
throw new Exception("not allowed");
return 1;
} catch(Exception e) {
return 2;
} finally{
return 3;
}
}

public static void main(String args[]){
P4 p = new P4();
p.test();
}
}