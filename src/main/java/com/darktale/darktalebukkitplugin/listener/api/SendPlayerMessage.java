package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.event.Event;
import com.darktale.darktaleapi.event.EventSendPlayerMessage;
import com.darktale.darktaleapi.listener.Listener;
import java.util.UUID;
import org.bukkit.Bukkit;

/**
 *
 * @author Ryan
 */
public class SendPlayerMessage extends Listener {

    public SendPlayerMessage(String listenerName) {
        super(listenerName);
    }

    @Override
    public void onCall(Event event) {
        //TODO: Find a way that the parameter can be EventSendPlayerMessage instead of casting it. This is weird.
        EventSendPlayerMessage messageEvent = (EventSendPlayerMessage) event;

        Bukkit.getPlayer(UUID.fromString(messageEvent.getPlayerID())).sendMessage(messageEvent.getMessage());
        Bukkit.broadcastMessage("Message listener from API called");
    }

}
