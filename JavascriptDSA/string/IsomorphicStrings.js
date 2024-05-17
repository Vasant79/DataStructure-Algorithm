/** check if strings isomorphic 
 * 
 * Input: s = "egg", t = "add"
    Output: true
*/

const s = "egg";
const t = "add";

// better approch -- store values of s in map1 & t in map2, check if mapS values meet T and vice-versa
var isIsomorphic = function (s, t) {
  if (s.length != t.length) return false;

  let mapS = {};
  let mapT = {};

  let i = 0;

  // first loop populates maps and mapt
  while (i < s.length) {
    mapS[s[i]] = t[i];
    mapT[t[i]] = s[i];

    i++;
  }

  for (let i = 0; i < s.length; i++) {
    if (mapS[s[i]] != t[i]) return false;
    if (mapT[t[i]] != s[i]) return false;
  }
  console.log(mapS, mapT);
  return true;
};
// ------------ approch 2 ---------------
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
