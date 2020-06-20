package com.twschool.practice;

public enum Direction {
    E {
        @Override
        public Direction leftDirection() {
            return N;
        }

        @Override
        public Direction rightDirection() {
            return S;
        }
    },
    S {
        @Override
        public Direction leftDirection() {
            return E;
        }

        @Override
        public Direction rightDirection() {
            return W;
        }
    },
    W {
        @Override
        public Direction leftDirection() {
            return S;
        }

        @Override
        public Direction rightDirection() {
            return N;
        }
    },
    N {
        @Override
        public Direction leftDirection() {
            return W;
        }

        @Override
        public Direction rightDirection() {
            return null;
        }
    };

    public abstract Direction leftDirection();
    public abstract Direction rightDirection();
}
