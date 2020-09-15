package book;

public class Author {
    private String fisrsNameLAstName;
    private int yearOfBirth;

    public Author(String fisrsNameLAstName, int yearOfBirth) {
        this.fisrsNameLAstName = fisrsNameLAstName;
        this.yearOfBirth = yearOfBirth;

    }

    public String getFisrsNameLAstName() {
        return fisrsNameLAstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Name of the author: ").append(getFisrsNameLAstName()).append(", ").
                append("year of birth: ").append(getYearOfBirth()).append(".");
        return s.toString();
    }
}
