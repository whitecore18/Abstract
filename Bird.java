abstract class Bird {
        protected String species;

        public Bird(String species) {
            this.species = species;
        }

        public abstract String fly();
        public abstract String makeSound();
    }
