# Git Commands Sheet

## Basic
```bash
git add .
```

```bash
git status
```

```bash
git commit -m "<commit-message>"
```

```bash
git push origin your/branch
```

## Aditional

#### Log untracked files only (path is optional)
```bash
git ls-files --others --exclude-standard -- path/to/directory
```

#### Add files only of a particular directory to the staging area
 ```bash
git add -- path/to/directory
 ```

#### Log status with indicators
```bash
git status --short
```

#### Log commit history (oneline is optional)
```bash
git log --oneline
```

#### Log repository history (complex)
```bash
git log --graph --oneline --all --decorate
```