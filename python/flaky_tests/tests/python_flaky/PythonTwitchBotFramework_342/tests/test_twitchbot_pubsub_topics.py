# Automatically generated by Pynguin.
import pytest
import twitchbot.pubsub.topics as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    pub_sub_topics_0 = module_0.PubSubTopics()
    assert module_0.PubSubTopics.bits == 'channel-bits-events-v2.'
    assert module_0.PubSubTopics.bits_badge_notification == 'channel-bits-badge-unlocks.'
    assert module_0.PubSubTopics.channel_points == 'channel-points-channel-v1.'
    assert module_0.PubSubTopics.channel_subscriptions == 'channel-subscribe-events-v1.'
    assert module_0.PubSubTopics.moderation_actions == 'chat_moderator_actions.'
    assert module_0.PubSubTopics.whispers == 'whispers.'
    pub_sub_topics_1 = module_0.PubSubTopics()
    pub_sub_topics_2 = module_0.PubSubTopics()
    pub_sub_topics_3 = module_0.PubSubTopics()
    module_0.PubSubTopics(*pub_sub_topics_3, **pub_sub_topics_3)