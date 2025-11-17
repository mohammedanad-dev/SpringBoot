 @GetMapping("/upper")
    public String upper(@RequestParam String text) {
        return text.toUpperCase();
    }
