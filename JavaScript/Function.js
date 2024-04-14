function name(name) {
    console.log("Hey " +name+ " You're good");
}
name("ravi");
name("sati");
name("mati");
name("kati");
function sum(a,b) {
    console.log(a+b);
    return a+b;  
}
sum(5,8);
sum(6,8);
sum(8,8);
console.log("The sum of the number is "+sum(2,8));
const func1 =(x)=>{
    console.log("arrow function",x)
}
func1(5);