# cobalt-plat-terraform-forge

`cobalt-plat-terraform-forge` is a Java project in platform engineering. Its focus is to package a Java local lab for terraform analysis with log and snapshot fixtures, replay consistency checks, and documented operating limits.

## Why It Exists

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how rollout width and route drift should influence a review result.

## Cobalt Plat Terraform Forge Review Notes

For a quick review, compare `route drift` with `quota pressure` before reading the middle cases.

## Features

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/cobalt-plat-terraform-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `route drift` and `quota pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `rollout width`, `quota pressure`, `route drift`, and `secret scope`.

The added Java path is deliberately direct, with fixtures doing most of the explaining.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `edge` is the high score at 231; `stress` is the low score at 129.

## Limitations And Roadmap

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
