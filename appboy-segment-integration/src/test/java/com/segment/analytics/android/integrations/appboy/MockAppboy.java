package com.segment.analytics.android.integrations.appboy;

import android.app.Activity;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.appboy.IAppboy;
import com.appboy.events.BrazeNetworkFailureEvent;
import com.appboy.events.BrazeSdkAuthenticationErrorEvent;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.IValueCallback;
import com.appboy.events.SessionStateChangedEvent;
import com.appboy.models.cards.Card;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.BrazeUser;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.InAppMessageEvent;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;

import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.List;

public class MockAppboy implements IAppboy {
  @Override
  public void openSession(Activity activity) {

  }

  @Override
  public void closeSession(Activity activity) {

  }

  @Override
  public void logCustomEvent(String s) {

  }

  @Override
  public void logCustomEvent(String s, BrazeProperties  brazeProperties) {

  }

  @Override
  public void logPurchase(String s, String s1, BigDecimal bigDecimal) {

  }

  @Override
  public void logPurchase(String s, String s1, BigDecimal bigDecimal, BrazeProperties brazeProperties) {

  }

  @Override
  public void logPurchase(String s, String s1, BigDecimal bigDecimal, int i) {

  }

  @Override
  public void logPurchase(String s, String s1, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties) {

  }

  @Override
  public void logPushNotificationOpened(String s) {

  }

  @Override
  public void logPushNotificationOpened(Intent intent) {

  }

  @Override
  public void logPushNotificationActionClicked(String s, String s1, String s2) {

  }

  @Override
  public void logPushStoryPageClicked(String s, String s1) {

  }

  @Override
  public void logContentCardsDisplayed() {

  }

  @Override
  public void logFeedDisplayed() {

  }

  @Override
  public void requestContentCardsRefresh(boolean b) {

  }

  @Override
  public void requestFeedRefresh() {

  }

  @Override
  public void requestFeedRefreshFromCache() {

  }

  @Override
  public void requestImmediateDataFlush() {

  }

  @Override
  public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {

  }

  @Override
  public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber) {

  }

  @Override
  public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber) {

  }

  @Override
  public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber) {

  }

  @Override
  public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber) {

  }

  @Override
  public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber) {

  }

  @Override
  public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> aClass) {

  }

  @Override
  public <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> aClass) {

  }

  @Override
  public void changeUser(String s) {

  }

  @Override
  public void changeUser(String s, String s1) {

  }

  @Override
  public BrazeUser getCurrentUser() {
    return null;
  }

  @Override
  public void getCurrentUser(IValueCallback<BrazeUser> iValueCallback) {

  }

  @Override
  public void registerAppboyPushMessages(String s) {

  }

  @Override
  public void registerPushToken(String s) {

  }

  @Override
  public String getAppboyPushMessageRegistrationId() {
    return null;
  }

  @Override
  public String getRegisteredPushToken() {
    return null;
  }

  @SuppressWarnings("deprecation")
  @Override
  public String getInstallTrackingId() {
    return null;
  }

  @Override
  public IBrazeImageLoader getImageLoader() {
    return null;
  }

  @Override
  public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {

  }

  @Override
  public int getContentCardCount() {
    return 0;
  }

  @Override
  public int getContentCardUnviewedCount() {
    return 0;
  }

  @Override
  public long getContentCardsLastUpdatedInSecondsFromEpoch() {
    return 0;
  }

  @Nullable
  @Override
  public List<Card> getCachedContentCards() {
    return null;
  }

  @Override
  public void setGoogleAdvertisingId(@NonNull String s, boolean b) {

  }

  @Override
  public IInAppMessage deserializeInAppMessageString(String s) {
    return null;
  }

  @Override
  public Card deserializeContentCard(@NonNull String s) {
    return null;
  }

  @Override
  public Card deserializeContentCard(@NonNull JSONObject jsonObject) {
    return null;
  }

  @Override
  public void requestLocationInitialization() {

  }

  @Override
  public void requestGeofences(double v, double v1) {

  }

  @NonNull
  @Override
  public String getDeviceId() {
    return null;
  }

  @SuppressWarnings("deprecation")
  @Override
  public void logFeedCardImpression(String s) {

  }

  @SuppressWarnings("deprecation")
  @Override
  public void logFeedCardClick(String s) {

  }

  @Override
  public void setSdkAuthenticationSignature(@NonNull String s) {

  }
}
