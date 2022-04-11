enum Direction {
    N() {
        @Override
        public Direction right() {
            return E;
        }
        @Override
        public Direction left() {
            return W;
        }
        @Override
        public int offset() {
            return 1;
        }
    },
    S(){
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }

        @Override
        public int offset() {
            return -1;
        }
    },
    E(){
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }

        @Override
        public int offset() {
            return 1;
        }
    },
    W(){
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }

        @Override
        public int offset() {
            return -1;
        }
    };

    public abstract Direction right();
    public abstract Direction left();
    public abstract int offset();

}
