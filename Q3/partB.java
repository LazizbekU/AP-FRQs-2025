public ArrayList<Match> buildMatches() {
    ArrayList<Match> matches = new ArrayList<Match>();
    int start = 0;
    if (competitorList.size() % 2 == 0) {
        start = 0;
    } else {
        start = 1;
    }
    int end = competitorList.size() - 1;

    while (start < end) {
        Match m = new Match(competitorList.get(start), competitorList.get(end));
        matches.add(m);
        start++;
        end--;
    }

    return matches;
}
