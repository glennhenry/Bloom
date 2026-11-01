---
title: Profile
slug: profile
description: Profile docs
---

An account associates a user with the system to contain fundamentals information about the user such as `userId`, `username`, `email`, `hashedPassword`, `registeredAt`, etc.

Profile on the other hand, is the domain data of users. It includes user's personal information, display name, avatar URL, account level, currencies, etc. but not including non-basic data like guestbook, market listing, posts history, etc.

### Credentials

The username is a unique ID that users use to login and identification. It is created on registration and can be changed later. It should only contain lowercase alphabets, numbers, and underscore (a-z, 0-9, \_). It may be shown in user's profile.

On the other hand, the display name will be displayed across the website. It doesn't have to be unique and may be changed often. The user will starts out with their username used as the display name.

A similar system can be found in YouTube and Discord: a user has unique username ID e.g., "@yujin_580" but display name could be "유진 fan 😊".

As for email, it isn't used for identification or login, but is used when user forgot their password (cannot be used without email system in the server).

### Avatar

A registered account gets a random avatar from the server. The server provides a set of default avatars. The avatars should be neutral, non-offensive, and memorable. It doesn't need to be detailed — a chibi graphics should do it.

The purpose of default avatar is to give the site a memorable icon. There shouldn't be too many avatars or them being too good — otherwise users won't customize their profile themselves.

Every avatar images goes to `assets/avatars/...`. When user upload avatar, it is saved in that directory. Default avatar is also saved there. On user's profile, the `avatarUrl` field will point to the link, for example `avatarUrl = avatars/smile.png`.

Uploading an avatar will generate a UUID for the avatar file name. For example, `avatarUrl = avatars/123e4567-e89b-12d3-a456-426614174000`. The user's profile field will also be updated accordingly.

### Profile

The profile contains various information:

- Overview: username, display name, country, birthday, site join date, last active, bio.
- Status: user's level, coins, attendance, ranking, badges, achievements, and other cosmetics.
- Activity (private): platform-wide users activity such as posts created, comments, likes, quests completed, badges earned, achievements completed, etc.
- Scrapbook (private): platform-wide bookmark of contents.
- Statistics: platform-wide statistics about the users such as number of posts, comments, likes, completed polls, day streak, number of completed quests.
- K-pop profile: available after participating in Bloom K-pop, contains my bias, favorite song, favorite era, started stanning at, what you like about them text field, etc.

### Profile Stats & Summary

Numbers data are separated from the actual content data. For example, individual user store their own posts count, which is incremented independently after they posted a topic in the cafe.
