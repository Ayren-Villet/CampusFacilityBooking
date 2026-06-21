# CampusFacilityBooking
Campus Facility & Equipment Booking System
A Domain-Driven Design project for managing bookings of university facilities
(labs, halls, rooms) and the equipment inside them, including maintenance
tracking, invoicing, and notifications.
Why this domain
It gives 10 entities that relate to each other naturally instead of feeling
bolted together, and it mirrors exactly the kind of model (entities → later
JPA persistence → later REST controllers) that shows up across a typical
software development curriculum, so the work here isn't a throwaway exercise.
Domain model summary
Entity	Key attributes	Relationships
`Department`	departmentId, name, building, headOfDepartment	—
`Staff`	staffId, name, email, role, department	belongs to `Department`
`Student`	studentId, name, studentNumber, department	belongs to `Department`
`Facility`	facilityId, name, type, capacity, location, department	belongs to `Department`
`Equipment`	equipmentId, name, serialNumber, status, facility	belongs to `Facility`
`TimeSlot`	timeSlotId, date, startTime, endTime	—
`Booking`	bookingId, facility, timeSlot, requesterId/Type, purpose, status	references `Facility`, `TimeSlot`
`MaintenanceRequest`	requestId, equipment, reportedById, description, priority, status, dateReported	references `Equipment`
`Invoice`	invoiceId, booking, amount, issueDate, dueDate, paid	references `Booking`
`Notification`	notificationId, recipientId, message, type, sentDate, read	references events above
Export your StarUML class diagram and drop it in `docs/uml.png` once your
lecturer approves it.
Entity assignment (2 per member)
Member	Entities
Member 1	`Department`, `Staff`
Member 2	`Student`, `Facility`
Member 3	`Equipment`, `TimeSlot`
Member 4	`Booking`, `MaintenanceRequest`
Member 5	`Invoice`, `Notification`
Update this table with actual names once roles are confirmed.
Project structure
```
campus-facility-booking/
├─ pom.xml
├─ README.md
├─ docs/
│  └─ uml.png
├─ src/
│  ├─ main/java/com/facilitybooking/domain/   ← all 10 entities live here
│  └─ test/java/com/facilitybooking/domain/   ← unit tests
└─ .github/
   ├─ ISSUE\_TEMPLATE/entity\_issue.md
   └─ PULL\_REQUEST\_TEMPLATE.md
```
Group Lead tasks
Get the UML diagram approved by the lecturer.
Create the GitHub repo (`campus-facility-booking`), push this Maven skeleton.
Invite all group members as collaborators and confirm they accept.
Create a Milestone: title `Domain Milestone`, due Sunday, 21 June 2026.
Create one issue per entity (10 total) using `.github/ISSUE\_TEMPLATE/entity\_issue.md`,
assign each to the responsible member, and attach them to the Domain Milestone.
Review and merge incoming pull requests once CI/tests pass.
Group Member tasks
Accept the collaboration invite.
Fork the repo, clone your fork locally.
Create a branch: `feature/<your-github-username>-<entity-name>`.
Implement your two assigned entities in `com.facilitybooking.domain`
following the Builder Pattern shown in the existing entities — replace the
placeholder `<Your Name> (<Student Number>)` in the file header with your
own details.
Add at least one unit test per entity.
Push to your fork, open a PR against the group repo `main` branch.
Once the Group Lead merges and signals, sync your fork:
```bash
   git fetch upstream
   git checkout main
   git pull upstream main
   git push origin main
   ```
Individual submission checklist
[ ] Your fork (`origin`) is in sync with the group repo `main` by 21 June 2026.
[ ] Both your assigned entities are implemented with the Builder Pattern.
[ ] File header comments and Javadoc are present.
[ ] PRs opened/merged and linked in your `submission.txt`.
[ ] `submission.txt` added to your fork's repo root, e.g.:
```
  GitHub username: <username>
  Entities implemented: Staff.java, Department.java
  PR links:
  - https://github.com/<group>/campus-facility-booking/pull/3
  Notes: All tests pass locally.
  ```
Building and testing
```bash
mvn clean package
mvn tes
