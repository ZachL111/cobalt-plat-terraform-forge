# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 205, lane `ship`
- `stress`: `quota pressure`, score 129, lane `watch`
- `edge`: `route drift`, score 231, lane `ship`
- `recovery`: `secret scope`, score 176, lane `ship`
- `stale`: `rollout width`, score 134, lane `watch`

## Note

This file is intentionally plain so the fixture remains the source of truth.
