const s = Symbol()
const s1 = Symbol()
const s2 = Symbol.for("Richard")
const s3 = Symbol.for("Richard")


console.log(typeof(s))
console.log(s2 === s3)


console.log(Symbol.keyFor(s3))

