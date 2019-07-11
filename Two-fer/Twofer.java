class Twofer {
    String twofer(String name) {
        String message;
        if(name == null)
            message = "One for you, one for me.";
        else
            message = "One for "+name+", one for me.";
        return message;
    }
}
