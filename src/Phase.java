public enum Phase {
    BEGINNING {
        @Override
        public void execute(Player player) {
            player.untapPermanents();
            player.drawCard();
            // Trigger beginning of turn abilities
        }
    },
    MAIN1 {
        @Override
        public void execute(Player player) {
           // Allow playing lands, casting spells (excluding instants), activating abilities
        }
    },
    COMBAT {
        @Override
        public void execute(Player player) {
           // Handle attacking and blocking
        }
    },
    MAIN2 {
        @Override
        public void execute(Player player) {
           // Same as MAIN1
        }
    },
    END {
        @Override
        public void execute(Player player) {
           // Trigger end of turn abilities
        }
    },
    CLEANUP {
        @Override
        public void execute(Player player) {
           player.discardToHandSize(); 
        }
    };

    public abstract void execute(Player player);
}