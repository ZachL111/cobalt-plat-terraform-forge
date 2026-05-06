# Cobalt Plat Terraform Forge Walkthrough

This note is the quickest way to read the extra review model in `cobalt-plat-terraform-forge`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 205 | ship |
| stress | quota pressure | 129 | watch |
| edge | route drift | 231 | ship |
| recovery | secret scope | 176 | ship |
| stale | rollout width | 134 | watch |

Start with `edge` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around quota pressure and secret scope.
