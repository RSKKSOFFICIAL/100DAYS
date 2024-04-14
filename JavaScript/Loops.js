for(let i = 1;i<=10;i++){
    console.log(i);
}
let obj = {
    name: "ravi",
    role: "programmer",
    company: "cmk"
}
for (const key in obj){
    const element = obj[key];
    console.log(key,element);
}
for (const key in obj){
    console.log(key);
}
for(const t of "ravi"){
    console.log(t);
}
let i = 5;
while (i<9){
    console.log(i);
    i++;
}
let j = 5;
do {
    console.log(j);
    j++;
    
} while (j<7);