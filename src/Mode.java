import java.util.Objects;

public class Mode {
    private boolean bargain;
    private boolean sounds;
    private boolean animations;
    private boolean timeLimit;
    private int timeLimitValue;
    private boolean newCards;
    private boolean borrowMoney;
    private boolean avatarFace;

    public Mode() {
        this.bargain = false;
        this.sounds = false;
        this.animations = false;
        this.timeLimit = false;
        this.timeLimitValue = 30;
        this.newCards = false;
        this.borrowMoney = false;
        this.avatarFace = false;
    }

    public Mode(int timeLimitValue) {
        this.bargain = false;
        this.sounds = false;
        this.animations = false;
        this.timeLimit = false;
        this.timeLimitValue = timeLimitValue;
        this.newCards = false;
        this.borrowMoney = false;
        this.avatarFace = false;
    }

    public Mode(boolean bargain, boolean sounds, boolean animations, boolean timeLimit, int timeLimitValue, boolean newCards, boolean borrowMoney, boolean avatarFace) {
        this.bargain = bargain;
        this.sounds = sounds;
        this.animations = animations;
        this.timeLimit = timeLimit;
        this.timeLimitValue = timeLimitValue;
        this.newCards = newCards;
        this.borrowMoney = borrowMoney;
        this.avatarFace = avatarFace;
    }

    public boolean isBargain() {
        return this.bargain;
    }

    public boolean getBargain() {
        return this.bargain;
    }

    public void setBargain(boolean bargain) {
        this.bargain = bargain;
    }

    public boolean isSounds() {
        return this.sounds;
    }

    public boolean getSounds() {
        return this.sounds;
    }

    public void setSounds(boolean sounds) {
        this.sounds = sounds;
    }

    public boolean isAnimations() {
        return this.animations;
    }

    public boolean getAnimations() {
        return this.animations;
    }

    public void setAnimations(boolean animations) {
        this.animations = animations;
    }

    public boolean isTimeLimit() {
        return this.timeLimit;
    }

    public boolean getTimeLimit() {
        return this.timeLimit;
    }

    public void setTimeLimit(boolean timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getTimeLimitValue() {
        return this.timeLimitValue;
    }

    public void setTimeLimitValue(int timeLimitValue) {
        this.timeLimitValue = timeLimitValue;
    }

    public boolean isNewCards() {
        return this.newCards;
    }

    public boolean getNewCards() {
        return this.newCards;
    }

    public void setNewCards(boolean newCards) {
        this.newCards = newCards;
    }

    public boolean isBorrowMoney() {
        return this.borrowMoney;
    }

    public boolean getBorrowMoney() {
        return this.borrowMoney;
    }

    public void setBorrowMoney(boolean borrowMoney) {
        this.borrowMoney = borrowMoney;
    }

    public boolean isAvatarFace() {
        return this.avatarFace;
    }

    public boolean getAvatarFace() {
        return this.avatarFace;
    }

    public void setAvatarFace(boolean avatarFace) {
        this.avatarFace = avatarFace;
    }

    public Mode bargain(boolean bargain) {
        this.bargain = bargain;
        return this;
    }

    public Mode sounds(boolean sounds) {
        this.sounds = sounds;
        return this;
    }

    public Mode animations(boolean animations) {
        this.animations = animations;
        return this;
    }

    public Mode timeLimit(boolean timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    public Mode timeLimitValue(int timeLimitValue) {
        this.timeLimitValue = timeLimitValue;
        return this;
    }

    public Mode newCards(boolean newCards) {
        this.newCards = newCards;
        return this;
    }

    public Mode borrowMoney(boolean borrowMoney) {
        this.borrowMoney = borrowMoney;
        return this;
    }

    public Mode avatarFace(boolean avatarFace) {
        this.avatarFace = avatarFace;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mode)) {
            return false;
        }
        Mode mode = (Mode) o;
        return bargain == mode.bargain && sounds == mode.sounds && animations == mode.animations && timeLimit == mode.timeLimit && timeLimitValue == mode.timeLimitValue && newCards == mode.newCards && borrowMoney == mode.borrowMoney && avatarFace == mode.avatarFace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bargain, sounds, animations, timeLimit, timeLimitValue, newCards, borrowMoney, avatarFace);
    }

    @Override
    public String toString() {
        return "{" +
            " bargain='" + isBargain() + "'" +
            ", sounds='" + isSounds() + "'" +
            ", animations='" + isAnimations() + "'" +
            ", timeLimit='" + isTimeLimit() + "'" +
            ", timeLimitValue='" + getTimeLimitValue() + "'" +
            ", newCards='" + isNewCards() + "'" +
            ", borrowMoney='" + isBorrowMoney() + "'" +
            ", avatarFace='" + isAvatarFace() + "'" +
            "}";
    }

}
