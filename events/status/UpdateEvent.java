package com.astro.astrostats.events.status;

import com.astro.astrostats.capabilities.IStats;
import com.astro.astrostats.events.AstroEvent;

import java.util.UUID;

public class UpdateEvent extends AstroEvent {

    private final UUID uuid;
    private final IStats status;
    private final IStats original;

    public UpdateEvent(UUID uuid, IStats status, IStats original) {
        this.status = status;
        this.original = original;
        this.uuid = uuid;
    }

    public UUID getUniqueID() {
        return uuid;
    }

    public IStats getStatus() {
        return status;
    }

    public IStats getOriginal() {
        return original;
    }
}
