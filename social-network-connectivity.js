const n = 4;
const log = [
  { a: 0, b: 1, t: 1 },
  { a: 2, b: 3, t: 1 },
  { a: 2, b: 1, t: 2 },
];

function connectivity() {
  const grp = new Array(4).fill(0).map((_,i) => i);
  const cnt = new Array(4).fill(1);

  for(entry of log) {
    const { a, b, t } = entry;
    const c = Math.min(grp[a], grp[b]);
    grp[a] = grp[b] = c;
    cnt[c] = cnt[a] + cnt[b];
    if (cnt[c] === n) {
      return t;
    }
    console.log(grp);
  }

  return undefined;
}

console.log(connectivity());
