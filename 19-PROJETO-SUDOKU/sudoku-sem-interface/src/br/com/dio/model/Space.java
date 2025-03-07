package br.com.dio.model;

public class Space {

    private Integer actual;
    private final int expectd;
    private final boolean fixed;

    public Space(final int expectd, final boolean fixed) {

        this.expectd = expectd;
        this.fixed = fixed;

        if (fixed) {
            this.actual = expectd;
        }
    }

    public Integer getActual() {
        return this.actual;
    }

    public void setActual(Integer actual) {
        if (fixed)
            return;
        this.actual = actual;
    }

    public void clearSpace() {
        setActual(null);
    }

    public int getExpectd() {
        return this.expectd;
    }

    public boolean getFixed() {
        return this.fixed;
    }

}
