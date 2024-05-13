/** check if strings isomorphic 
 * 
 * Input: s = "egg", t = "add"
    Output: true
*/

const s = "egg";
const t = "add";

function isomorphic(s, t) {
  if (s.length != t.length) {
    return false;
  }

  let map = new Map();
  let set = new Set();

  let count = 0;
  while (count < s.length) {
    let ch = s[count];

    if (!map.has(ch)) {
      if (set.has(t[count])) {
        return false;
      }
      map.set(ch, t[count]);
      set.add(t[count]);
    } else {
      if (map.get(ch) != t[count]) {
        return;
      }
    }
    count++;
  }

  return true;
}

console.log(isomorphic(s, t));
