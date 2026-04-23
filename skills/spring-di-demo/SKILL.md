---
name: spring-di-demo
description: Inspect, explain, and extend this Spring Boot dependency injection demo. Use when working on simple bean wiring tasks in this repository, especially controller-service-repository flows, constructor vs setter injection, adding demo endpoints or services, or explaining how the existing dependency chain works.
---

# Spring DI Demo

## Overview

Use this skill to work inside the sample Spring Boot project in this repository.
Focus on clear, small changes that keep the dependency injection example easy to read.

## Quick Start

1. Read `references/project-map.md` before changing behavior.
2. Inspect the current bean chain from controller to service to repository.
3. Prefer minimal code changes that make the injection pattern easier to understand.
4. Keep explanations concrete and tie them to actual files in this repo.

## Working Rules

- Preserve the current educational nature of the project. Do not over-engineer the example.
- Prefer constructor injection when adding new beans unless the task is specifically about setter injection.
- Keep logging or `System.out.println(...)` output only when it helps demonstrate bean creation order or injection behavior.
- If adding a new example, follow the same package layout used by the existing code: `controller`, `service`, `dao`, `model`.
- If a task is only explanatory, describe how the current classes interact instead of rewriting them.

## Common Tasks

### Explain the existing dependency flow

- Trace dependencies in this order: controller -> service -> repository.
- Point out which annotations make each class a Spring bean.
- Note whether injection happens through constructors, setters, or both.

### Add a simple demo feature

- Add one small model or service at a time.
- Reuse the current package naming pattern.
- Keep the API surface minimal so the DI pattern remains the main focus.

### Refactor the example for clearer DI

- Prefer a single injection style per class when the goal is clarity.
- If converting to constructor injection, remove redundant setter injection unless the user wants to compare both styles.
- Keep the code easy for a beginner to follow.

## References

- Read `references/project-map.md` for the current file layout and the DI relationships in this repository.
