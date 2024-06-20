// Recent contest problems

const problems = 6;

const contest = [
  "START38",
  "LTIME108",
  "LTIME108",
  "LTIME108",
  "START38",
  "LTIME108",
];

function problemInEachContest(problems, contest) {
  let start38problems = 0;

  for (let i = 0; i < contest.length; i++) {
    if (contest[i] == "START38") {
      start38problems++;
    }
  }

  let ltime108problems = problems - start38problems;

  console.log(start38problems, ltime108problems);
}

problemInEachContest(problems, contest);
