---
title: Package Structure
slug: package-structure
description: Package Structure docs
---

The current package structure:

```
bloom/                      # Base source directory
├── activity/               # Activity and event-driven architecture system
├── auth/                   # Auth APIs: register, login, session
├── core/                   # Foundational code
│   ├── config/             # App config
│   ├── context/            # Server-side dependency container
│   ├── definition/         # Data assets abstraction
│   ├── devtools/           # Developer tools
│   ├── mongo/              # Mongo collection entries
│   └── web/                # Web abstractions: basic site and file routes, guard
│
├── entertainment/          # Entertainment section
│   ├── ask/                # Polls, quiz
│   └── games/              # Games
│
├── internet/               # Internet section
│   ├── find/               # Search tools
│   ├── info/               # News
│   └── tools/              # Web tools and utilities
│
├── kpop/                   # K-pop section
│   └── cafe/               # K-pop based forum
│
├── lobby/                  # Bloom lobby
├── messaging/              # Messaging section
│   └── mail/               # Email service
│
├── people/                 # People section
│   ├── community/          # Bloom main forum
│   ├── conversation        # Live chatting
│   └── story               # User blogs
│
├── profile/                # Bloom users profile
└── services/               # Services section
    ├── atlas/              # Maps service
    ├── finance/            # Finance necessities
    ├── forecast/           # Weather report
    └── mall/               # E-shopping
```

- Bloom divides package into domain.
- Core is non-domain directory where all foundational sources are gathered.
- Domain may use sub-section like "community" and "conversation" inside "people."
- Each section or sub-section may create a `view` package for source that are related to client UI source. The `model` and `payload` package should be created to separate between client model and incoming or outgoing payload model.
