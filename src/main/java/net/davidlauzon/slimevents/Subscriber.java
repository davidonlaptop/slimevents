package net.davidlauzon.slimevents;

/**
 * Created by david on 15-11-05.
 */
public interface Subscriber
{
    void onTrace(Event event);
    void onDebug(Event event);
    void onInfo(Event event);
    void onWarn(Event event);
    void onError(Event event);
}
