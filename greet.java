@GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name;
    }
